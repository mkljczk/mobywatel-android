package pl.gov.coi.common.ui.ds.chatbubble

import pl.gov.coi.common.domain.label.CommonUILabelProvider
import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.button.ButtonData
import pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIconData
import pl.gov.coi.common.ui.ds.button.common.ButtonSize
import pl.gov.coi.common.ui.ds.button.common.ButtonType
import pl.gov.coi.common.ui.ds.button.common.ButtonVariant
import pl.gov.coi.common.ui.theme.AppTheme

sealed class ChatBubbleData(
  open val label: Label?,
  open val isLoading: Boolean,
  open val content: List&lt;Content&gt;?,
  open val additionalInfo: Label?,
  open val footerData: FooterData?,
  open val actions: List&lt;ClickableContent&gt;?,
  open val suggestions: List&lt;ClickableContent&gt;?,
  open val onUrlClick: (String) -&gt; Unit,
) {

  data class IncomingMessage(
    override val label: Label?,
    override val isLoading: Boolean = true,
    override val content: List&lt;Content&gt;? = null,
    override val additionalInfo: Label? = null,
    override val footerData: FooterData? = null,
    override val actions: List&lt;ClickableContent&gt;? = null,
    override val suggestions: List&lt;ClickableContent&gt;? = null,
    override val onUrlClick: (String) -&gt; Unit = {},
  ) : ChatBubbleData(
    label = label,
    isLoading = isLoading,
    content = content,
    additionalInfo = additionalInfo,
    footerData = footerData,
    actions = actions,
    suggestions = suggestions,
    onUrlClick = onUrlClick,
  )

  data class OutgoingMessage(
    override val label: Label? = null,
    override val content: List&lt;Content&gt;,
  ) : ChatBubbleData(
    label = label,
    isLoading = false,
    content = content,
    additionalInfo = null,
    footerData = null,
    actions = null,
    suggestions = null,
    onUrlClick = {},
  )
}

data class Content(
  val type: ContentType,
  val value: String,
  val url: String? = null,
)

enum class ContentType {
  TEXT,
  SOURCE,
  LINK,
  UNKNOWN,
}

data class FooterData(
  val sourcesData: SourcesData?,
  val actionsData: List&lt;FooterActionData&gt;,
) {
  internal val isVisible = sourcesData != null || actionsData.isNotEmpty()
}

data class SourcesData(
  val title: Label,
  val showMoreButtonLabel: Label,
  val showLessButtonLabel: Label,
  val items: List&lt;ClickableContent&gt;,
)

data class ClickableContent(
  val value: String,
  val onClick: () -&gt; Unit,
) {
  internal val actionButtonData = ButtonData(
    buttonSize = ButtonSize.Large(),
    buttonVariant = ButtonVariant.Secondary(),
    buttonType = ButtonType.WithText(
      label = value.toLabel(tag = &quot;buttonTypeValue&quot;),
    ),
    onClick = onClick,
  )
}

sealed class FooterActionData {
  abstract val buttonData: ButtonIconData

  data class Share(val onClick: () -&gt; Unit) : FooterActionData() {
    override val buttonData: ButtonIconData = ButtonIconData(
      iconResId = R.drawable.aa005_upload,
      iconColorProvider = { AppTheme.colors.neutral200 },
      onClick = onClick,
      contentDescription = CommonUILabelProvider.commonAccessibilityAnswerShare(),
    )
  }

  sealed class Toggleable(
    open val isSelected: Boolean,
    open val onToggle: (selected: Boolean) -&gt; Unit,
  ) : FooterActionData() {
    override val buttonData by lazy {
      ButtonIconData(
        iconResId = iconResId,
        iconColorProvider = {
          when (isSelected) {
            true -&gt; AppTheme.colors.primary900
            else -&gt; AppTheme.colors.neutral200
          }
        },
        onClick = { onToggle(!isSelected) },
        contentDescription = contentDescription(),
      )
    }

    data class PositiveRate(
      override val isSelected: Boolean,
      override val onToggle: (selected: Boolean) -&gt; Unit,
    ) : Toggleable(
      isSelected = isSelected,
      onToggle = onToggle,
    )

    data class NegativeRate(
      override val isSelected: Boolean,
      override val onToggle: (selected: Boolean) -&gt; Unit,
    ) : Toggleable(
      isSelected = isSelected,
      onToggle = onToggle,
    )
  }
}

private val FooterActionData.Toggleable.iconResId
  get() = when (this) {
    is FooterActionData.Toggleable.PositiveRate -&gt; when (isSelected) {
      true -&gt; R.drawable.b013_like
      false -&gt; R.drawable.ah001_like
    }
    is FooterActionData.Toggleable.NegativeRate -&gt; when (isSelected) {
      true -&gt; R.drawable.b014_dislike
      false -&gt; R.drawable.ah002_dislike
    }
  }

private fun FooterActionData.Toggleable.contentDescription(): Label {
  val statusContentDescription = if (isSelected) {
    CommonUILabelProvider.commonAccessibilityChecked()
  } else {
    CommonUILabelProvider.commonAccessibilityUnchecked()
  }
  val iconContentDescription = when (this) {
    is FooterActionData.Toggleable.PositiveRate -&gt; CommonUILabelProvider.commonAccessibilityAnswerHelpful()
    is FooterActionData.Toggleable.NegativeRate -&gt; CommonUILabelProvider.commonAccessibilityAnswerUnhelpful()
  }
  return &quot;${iconContentDescription.text}. ${statusContentDescription.text}.&quot;
    .toLabel(
      tag = &quot;${iconContentDescription.tag}_${statusContentDescription.tag}&quot;,
    )
}
