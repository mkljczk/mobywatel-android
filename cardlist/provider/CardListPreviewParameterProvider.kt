package pl.gov.coi.common.ui.ds.cardlist.provider

import android.content.Context
import pl.gov.coi.common.domain.Mapper
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.button.ButtonData
import pl.gov.coi.common.ui.ds.button.common.ButtonSize
import pl.gov.coi.common.ui.ds.button.common.ButtonType
import pl.gov.coi.common.ui.ds.button.common.ButtonVariant
import pl.gov.coi.common.ui.ds.cardlist.CardListData
import pl.gov.coi.common.ui.ds.custom.icon.IconSize
import pl.gov.coi.common.ui.ds.singlecard.radiobutton.OldRadioButtonData
import pl.gov.coi.common.ui.ds.singlecard.radiobutton.RadioButtonId
import pl.gov.coi.common.ui.ds.singlecard.SingleCardClickableRadioButtonState
import pl.gov.coi.common.ui.ds.singlecard.SingleCardData
import pl.gov.coi.common.ui.ds.singlecard.SingleCardInfoExtras
import pl.gov.coi.common.ui.ds.singlecard.SingleCardInfoState
import pl.gov.coi.common.ui.ds.singlecard.SingleCardStatusBadgeData
import pl.gov.coi.common.ui.ds.switchcomponent.SwitchData
import pl.gov.coi.common.ui.preview.CustomWrappedDataPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestDataProvider
import pl.gov.coi.common.ui.preview.WrappedValue

data class ProvidedCardListData(
  val previewName: String,
  val data: CardListData,
)

class CardListPreviewProvider : CustomWrappedDataPreviewParameterProvider&lt;
  Unit,
  CardListData,
  Mapper&lt;Unit, CardListData&gt;,
  ProvidedCardListData,
  &gt;() {

  private val cards = mapOf(
    &quot;InfoTitle&quot; to getCardListInfoTitle(),
    &quot;InfoTitleLong&quot; to getCardListInfoTitleLong(),
    &quot;InfoTitleDescriptionLong&quot; to getCardListInfoTitleDescriptionLong(),
    &quot;InfoTitleInfo&quot; to getCardListInfoTitleInfo(),
    &quot;InfoTitleDescription&quot; to getCardListInfoTitleDescription(),
    &quot;InfoTitleInfoLong&quot; to getCardListInfoTitleInfoLong(),
    &quot;InfoTitleIcon&quot; to getCardListInfoTitleIcon(),
    &quot;InfoTitleIconBigger&quot; to getCardListInfoTitleIconBigger(),
    &quot;InfoTitleDescriptionIcon&quot; to getCardListInfoTitleDescriptionIcon(),
    &quot;InfoTitleDescriptionIconDisabledState&quot; to getCardListInfoTitleDescriptionIconDisabledState(),
    &quot;InfoTitleWithButton&quot; to getCardListInfoTitleWithButton(),
    &quot;InfoTitleWithSwitch&quot; to getCardListInfoTitleWithSwitch(),
    &quot;ClickableTitle&quot; to getCardListClickableTitle(),
    &quot;ClickableTitleLong&quot; to getCardListClickableTitleLong(),
    &quot;ClickableTitleDescription&quot; to getCardListClickableTitleDescription(),
    &quot;ClickableTitleDescriptionLong&quot; to getCardListClickableTitleDescriptionLong(),
    &quot;ClickableInfoTitle&quot; to getCardListClickableInfoTitle(),
    &quot;ClickableInfoTitleLong&quot; to getCardListClickableInfoTitleLong(),
    &quot;ClickableIconTitle&quot; to getCardListClickableIconTitle(),
    &quot;ClickableIconTitleLong&quot; to getCardListClickableIconTitleLong(),
    &quot;ClickableIconTitleDescription&quot; to getCardListClickableIconTitleDescription(),
    &quot;ClickableIconTitleDescriptionLong&quot; to getCardListClickableIconTitleDescriptionLong(),
    &quot;ClickableIconTitleDescriptionLongIconOnOneLineWithTitle&quot; to
      getCardListClickableIconTitleDescriptionLongIconOnOneLineWithTitle(),
    &quot;ClickableIconTitleDescriptionLongFocusState&quot; to getCardListClickableIconTitleDescriptionLongFocusState(),
    &quot;ClickableIconTitleDescriptionLongDisabledState&quot; to getCardListClickableIconTitleDescriptionLongDisabledState(),
    &quot;ClickableTitleDescriptionStatusBadge&quot; to getCardListClickableTitleDescriptionStatusBadge(),
    &quot;ClickableButtonIconTitle&quot; to getCardListClickableButtonIconTitle(),
    &quot;ClickableDeleteButtonIconTitle&quot; to getCardListClickableDeleteButtonIconTitle(),
    &quot;SelectableRadioButtonTitleUnselected&quot; to getCardListSelectableRadioButtonTitleUnselected(),
    &quot;SelectableRadioButtonTitleUnselectedFocusState&quot; to getCardListSelectableRadioButtonTitleUnselectedFocusState(),
    &quot;SelectableRadioButtonTitleUnselectedDisabledState&quot; to
      getCardListSelectableRadioButtonTitleUnselectedDisabledState(),
    &quot;SelectableRadioButtonTitleUnselectedLong&quot; to getCardListSelectableRadioButtonTitleUnselectedLong(),
    &quot;SelectableRadioButtonTitleSelected&quot; to getCardListSelectableRadioButtonTitleSelected(),
    &quot;SelectableRadioButtonIconTitleUnselected&quot; to getCardListSelectableRadioButtonIconTitleUnselected(),
    &quot;SelectableRadioButtonIconTitleUnselectedLong&quot; to getCardListSelectableRadioButtonIconTitleUnselectedLong(),
    &quot;SelectableRadioButtonIconTitleSelected&quot; to getCardListSelectableRadioButtonIconTitleSelected(),
    &quot;SelectableRadioButtonBiggerIconTitleSelected&quot; to getCardListSelectableRadioButtonBiggerIconTitleSelected(),
    &quot;SelectableRadioButtonTitleDescriptionUnselected&quot; to getCardListSelectableRadioButtonTitleDescriptionUnselected(),
    &quot;SelectableRadioButtonTitleDescriptionUnselectedLong&quot; to
      getCardListSelectableRadioButtonTitleDescriptionUnselectedLong(),
    &quot;SelectableRadioButtonTitleDescriptionSelected&quot; to getCardListSelectableRadioButtonTitleDescriptionSelected(),
  )

  override fun mapper(context: Context): Mapper&lt;Unit, CardListData&gt; {
    return object : Mapper&lt;Unit, CardListData&gt; {
      override fun invoke(p1: Unit): CardListData = CardListData(cards = emptyList())
    }
  }

  override val screenShotTestValues: Sequence&lt;ScreenShotTestDataProvider&lt;ProvidedCardListData&gt;&gt;
    get() = cards.map { (testName, cardData) -&gt;
      ScreenShotTestDataProvider(
        screenShotTestName = testName,
        wrappedValue = WrappedValue {
          ProvidedCardListData(
            previewName = testName,
            data = cardData,
          )
        },
      )
    }.asSequence()

  private fun getCardListInfoTitle() = CardListData(
    cards = listOf(
      SingleCardData.Info.Title(
        title = &quot;Card title&quot;.toLabel(),
      ),
      SingleCardData.Info.Title(
        title = &quot;Card title 2&quot;.toLabel(),
      ),
    ),
  )

  private fun getCardListInfoTitleLong() = CardListData(
    cards = listOf(
      SingleCardData.Info.Title(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing &quot; +
            &quot;elit, sed do eiusmod tempor incididunt&quot;
          ).toLabel(),
      ),
      SingleCardData.Info.Title(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing &quot; +
            &quot;elit, sed do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
      ),
    ),
  )

  private fun getCardListInfoTitleDescription() = CardListData(
    cards = listOf(
      SingleCardData.Info.TitleDescription(
        title = &quot;Card title&quot;.toLabel(),
        description = &quot;Card description&quot;.toLabel(),
      ),
      SingleCardData.Info.TitleDescription(
        title = &quot;Card title 2&quot;.toLabel(),
        description = &quot;Card description 2&quot;.toLabel(),
      ),
    ),
  )

  private fun getCardListInfoTitleDescriptionLong() = CardListData(
    cards = listOf(
      SingleCardData.Info.TitleDescription(
        title = &quot;Card title&quot;.toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing &quot; +
            &quot;elit, sed do eiusmod tempor incididunt&quot;
          )
          .toLabel(),
      ),
      SingleCardData.Info.TitleDescription(
        title = &quot;Card title 2&quot;.toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing &quot; +
            &quot;elit, sed do eiusmod tempor incididunt 2&quot;
          )
          .toLabel(),
      ),
    ),
  )

  private fun getCardListInfoTitleInfo() = CardListData(
    cards = listOf(
      SingleCardData.Info.InfoTitle(
        title = &quot;Card title&quot;.toLabel(),
        info = &quot;Card info&quot;.toLabel(),
      ),
      SingleCardData.Info.InfoTitle(
        title = &quot;Card title 2&quot;.toLabel(),
        info = &quot;Card info 2&quot;.toLabel(),
      ),
    ),
  )

  private fun getCardListInfoTitleInfoLong() = CardListData(
    cards = listOf(
      SingleCardData.Info.InfoTitle(
        title = &quot;Card title&quot;.toLabel(),
        info = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do &quot; +
            &quot;eiusmod tempor incididunt&quot;
          ).toLabel(),
      ),
      SingleCardData.Info.InfoTitle(
        title = &quot;Card title 2&quot;.toLabel(),
        info = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do &quot; +
            &quot;eiusmod tempor incididunt 2&quot;
          ).toLabel(),
      ),
    ),
  )

  private fun getCardListInfoTitleIcon() = CardListData(
    cards = listOf(
      SingleCardData.Info.IconTitle(
        title = &quot;Card title&quot;.toLabel(),
        iconResId = R.drawable.ab001_home,
      ),
      SingleCardData.Info.IconTitle(
        title = &quot;Card title 2&quot;.toLabel(),
        iconResId = R.drawable.ab001_home,
      ),
    ),
  )

  private fun getCardListInfoTitleIconBigger() = CardListData(
    cards = listOf(
      SingleCardData.Info.IconTitle(
        title = &quot;Card title&quot;.toLabel(),
        iconResId = R.drawable.ab001_home,
        iconSize = IconSize.SIZE32,
      ),
      SingleCardData.Info.IconTitle(
        title = &quot;Card title 2&quot;.toLabel(),
        iconResId = R.drawable.ab001_home,
        iconSize = IconSize.SIZE32,
      ),
    ),
  )

  private fun getCardListInfoTitleDescriptionIcon() = CardListData(
    cards = listOf(
      SingleCardData.Info.IconTitleDescription(
        title = &quot;Card title&quot;.toLabel(),
        description = &quot;Card description&quot;.toLabel(),
        iconResId = R.drawable.ab001_home,
      ),
      SingleCardData.Info.IconTitleDescription(
        title = &quot;Card title 2&quot;.toLabel(),
        description = &quot;Card description 2&quot;.toLabel(),
        iconResId = R.drawable.ab001_home,
      ),
    ),
  )

  private fun getCardListInfoTitleDescriptionIconDisabledState() = CardListData(
    cards = listOf(
      SingleCardData.Info.IconTitleDescription(
        title = &quot;Card title&quot;.toLabel(),
        description = &quot;Card description&quot;.toLabel(),
        iconResId = R.drawable.ab001_home,
        state = SingleCardInfoState.DISABLE,
      ),
      SingleCardData.Info.IconTitleDescription(
        title = &quot;Card title 2&quot;.toLabel(),
        description = &quot;Card description 2&quot;.toLabel(),
        iconResId = R.drawable.ab001_home,
        state = SingleCardInfoState.DISABLE,
      ),
    ),
  )

  private fun getCardListInfoTitleWithButton() = CardListData(
    cards = listOf(
      SingleCardData.Info.Title(
        title = &quot;Card title&quot;.toLabel(),
        extras = SingleCardInfoExtras.ButtonMore(
          buttonData = ButtonData(
            buttonSize = ButtonSize.Small,
            buttonVariant = ButtonVariant.Primary,
            buttonType = ButtonType.WithText(
              label = &quot;Więcej&quot;.toLabel(),
            ),
            onClick = {},
          ),
        ),
      ),
      SingleCardData.Info.Title(
        title = &quot;Card title 2&quot;.toLabel(),
        extras = SingleCardInfoExtras.ButtonMore(
          buttonData = ButtonData(
            buttonSize = ButtonSize.Small,
            buttonVariant = ButtonVariant.Primary,
            buttonType = ButtonType.WithText(
              label = &quot;Więcej 2&quot;.toLabel(),
            ),
            onClick = {},
          ),
        ),
      ),
    ),
  )

  private fun getCardListInfoTitleWithSwitch() = CardListData(
    cards = listOf(
      SingleCardData.Info.Title(
        title = &quot;Card title&quot;.toLabel(),
        extras = SingleCardInfoExtras.Switch(
          switchData = SwitchData.SwitchOnly(
            contentDescription = &quot;Card title&quot;.toLabel(),
            checked = false,
            onCheckedChange = {},
          ),
        ),
      ),
      SingleCardData.Info.Title(
        title = &quot;Card title 2&quot;.toLabel(),
        extras = SingleCardInfoExtras.Switch(
          switchData = SwitchData.SwitchOnly(
            checked = false,
            contentDescription = &quot;Card title 2&quot;.toLabel(),
            onCheckedChange = {},
          ),
        ),
      ),
    ),
  )

  private fun getCardListClickableTitle() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.Title(
        title = &quot;Card title&quot;.toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.Title(
        title = &quot;Card title 2&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableTitleLong() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.Title(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.Title(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableTitleDescription() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.TitleDescription(
        title = &quot;Card title&quot;.toLabel(),
        description = &quot;Card description&quot;.toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.TitleDescription(
        title = &quot;Card title 2&quot;.toLabel(),
        description = &quot;Card description 2&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableTitleDescriptionLong() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.TitleDescription(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor&quot;
          ).toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.TitleDescription(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor 2&quot;
          ).toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableInfoTitle() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.InfoTitle(
        title = &quot;Card title&quot;.toLabel(),
        info = &quot;Card info&quot;.toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.InfoTitle(
        title = &quot;Card title 2&quot;.toLabel(),
        info = &quot;Card info 2&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableInfoTitleLong() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.InfoTitle(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        info = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.InfoTitle(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        info = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableIconTitle() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.IconTitle(
        iconResId = R.drawable.ab001_home,
        title = &quot;Card title&quot;.toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.IconTitle(
        iconResId = R.drawable.ab001_home,
        title = &quot;Card title 2&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableIconTitleLong() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.IconTitle(
        iconResId = R.drawable.ab001_home,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.IconTitle(
        iconResId = R.drawable.ab001_home,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableIconTitleDescription() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.IconTitleDescription(
        iconResId = R.drawable.ab001_home,
        title = &quot;Card title&quot;.toLabel(),
        description = &quot;Card description&quot;.toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.IconTitleDescription(
        iconResId = R.drawable.ab001_home,
        title = &quot;Card title 2&quot;.toLabel(),
        description = &quot;Card description 2&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableIconTitleDescriptionLong() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.IconTitleDescription(
        iconResId = R.drawable.ab001_home,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor&quot;
          ).toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.IconTitleDescription(
        iconResId = R.drawable.ab001_home,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor 2&quot;
          ).toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableIconTitleDescriptionLongIconOnOneLineWithTitle() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.IconTitleDescription(
        iconResId = R.drawable.ab001_home,
        iconOnOneLineWithTitle = true,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor&quot;
          ).toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.IconTitleDescription(
        iconResId = R.drawable.ab001_home,
        iconOnOneLineWithTitle = true,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor 2&quot;
          ).toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableIconTitleDescriptionLongFocusState() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.IconTitleDescription(
        iconResId = R.drawable.ab001_home,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor&quot;
          ).toLabel(),
        state = SingleCardClickableRadioButtonState.FOCUS,
        onClick = {},
      ),
      SingleCardData.Clickable.IconTitleDescription(
        iconResId = R.drawable.ab001_home,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor 2&quot;
          ).toLabel(),
        state = SingleCardClickableRadioButtonState.ENABLED,
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableIconTitleDescriptionLongDisabledState() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.IconTitleDescription(
        iconResId = R.drawable.ab001_home,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor&quot;
          ).toLabel(),
        state = SingleCardClickableRadioButtonState.DISABLED,
        onClick = {},
      ),
      SingleCardData.Clickable.IconTitleDescription(
        iconResId = R.drawable.ab001_home,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor 2&quot;
          ).toLabel(),
        state = SingleCardClickableRadioButtonState.DISABLED,
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableTitleDescriptionStatusBadge() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.TitleDescriptionStatusBadge(
        title = &quot;Card title with status badge&quot;.toLabel(),
        description = &quot;Card description&quot;.toLabel(),
        badgeData = SingleCardStatusBadgeData.WithIcon.Info(
          text = &quot;Badge status info&quot;.toLabel(),
          iconContentDescription = &quot;content desc&quot;.toLabel(),
        ),
        onClick = {},
      ),
      SingleCardData.Clickable.TitleDescriptionStatusBadge(
        title = &quot;Card title with status badge 2&quot;.toLabel(),
        description = &quot;Card description 2&quot;.toLabel(),
        badgeData = SingleCardStatusBadgeData.WithIcon.Info(
          text = &quot;Badge status info 2&quot;.toLabel(),
          iconContentDescription = &quot;content desc 2&quot;.toLabel(),
        ),
        onClick = {},
      ),
    ),
  )

  private fun getCardListClickableButtonIconTitle() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.ButtonIconTitle(
        iconResId = R.drawable.ab001_home,
        title = &quot;Card title&quot;.toLabel(),
        onIconClick = {},
      ),
      SingleCardData.Clickable.ButtonIconTitle(
        iconResId = R.drawable.ab001_home,
        title = &quot;Card title 2&quot;.toLabel(),
        onIconClick = {},
      ),
    ),
  )

  private fun getCardListClickableDeleteButtonIconTitle() = CardListData(
    cards = listOf(
      SingleCardData.Clickable.DeleteButtonIconTitle(
        title = &quot;Card title&quot;.toLabel(),
        onClick = {},
      ),
      SingleCardData.Clickable.DeleteButtonIconTitle(
        title = &quot;Card title 2&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonTitleUnselected() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.Title(
        title = &quot;Card title&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.Title(
        title = &quot;Card title 2&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonTitleUnselectedFocusState() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.Title(
        title = &quot;Card title&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(
          id = RadioButtonId.Default,
          isSelected = false,
        ),
        state = SingleCardClickableRadioButtonState.FOCUS,
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.Title(
        title = &quot;Card title 2&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        state = SingleCardClickableRadioButtonState.FOCUS,
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonTitleUnselectedDisabledState() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.Title(
        title = &quot;Card title&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(
          id = RadioButtonId.Default,
          isSelected = false,
        ),
        state = SingleCardClickableRadioButtonState.DISABLED,
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.Title(
        title = &quot;Card title 2&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(
          id = RadioButtonId.Default,
          isSelected = false,
        ),
        state = SingleCardClickableRadioButtonState.DISABLED,
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonTitleUnselectedLong() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.Title(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        radioButtonData = OldRadioButtonData(
          id = RadioButtonId.Default,
          isSelected = false,
        ),
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.Title(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        radioButtonData = OldRadioButtonData(
          id = RadioButtonId.Default,
          isSelected = false,
        ),
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonTitleSelected() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.Title(
        title = &quot;Card title&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(
          id = RadioButtonId.Default,
          isSelected = true,
        ),
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.Title(
        title = &quot;Card title 2&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(
          id = RadioButtonId.Default,
          isSelected = false,
        ),
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonIconTitleUnselected() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.IconTitle(
        iconResId = R.drawable.ab001_home,
        title = &quot;Card title&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.IconTitle(
        iconResId = R.drawable.ab001_home,
        title = &quot;Card title 2&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonIconTitleUnselectedLong() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.IconTitle(
        iconResId = R.drawable.ab001_home,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.IconTitle(
        iconResId = R.drawable.ab001_home,
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonIconTitleSelected() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.IconTitle(
        iconResId = R.drawable.ab001_home,
        title = &quot;Card title&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = true),
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.IconTitle(
        iconResId = R.drawable.ab001_home,
        title = &quot;Card title 2&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonBiggerIconTitleSelected() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.IconTitle(
        iconResId = R.drawable.ab001_home,
        iconSize = IconSize.SIZE32,
        title = &quot;Card title&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = true),
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.IconTitle(
        iconResId = R.drawable.ab001_home,
        iconSize = IconSize.SIZE32,
        title = &quot;Card title 2&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonTitleDescriptionUnselected() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.TitleDescription(
        title = &quot;Card title&quot;.toLabel(),
        description = &quot;Card description no 1&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.TitleDescription(
        title = &quot;Card title 2&quot;.toLabel(),
        description = &quot;Card description no 2&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonTitleDescriptionUnselectedLong() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.TitleDescription(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor&quot;
          ).toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.TitleDescription(
        title = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed &quot; +
            &quot;do eiusmod tempor incididunt 2&quot;
          ).toLabel(),
        description = (
          &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, &quot; +
            &quot;sed do eiusmod tempor 2&quot;
          ).toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
    ),
  )

  private fun getCardListSelectableRadioButtonTitleDescriptionSelected() = CardListData(
    cards = listOf(
      SingleCardData.SelectableRadioButton.TitleDescription(
        title = &quot;Card title&quot;.toLabel(),
        description = &quot;Card description no 1&quot;.toLabel(),
        descriptionSecond = &quot;Card description no 2&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = true),
        onClick = {},
      ),
      SingleCardData.SelectableRadioButton.TitleDescription(
        title = &quot;Card title 2&quot;.toLabel(),
        description = &quot;Card description no 2&quot;.toLabel(),
        descriptionSecond = &quot;Card description no 2&quot;.toLabel(),
        radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
        onClick = {},
      ),
    ),
  )
}
