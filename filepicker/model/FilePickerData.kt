package pl.gov.coi.common.ui.ds.filepicker.model

import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.theme.AppTheme
import pl.gov.coi.common.ui.unmapped.singlecard.BodySection
import pl.gov.coi.common.ui.unmapped.singlecard.BodyTitleSection
import pl.gov.coi.common.ui.unmapped.singlecard.DefaultSingleCardData
import pl.gov.coi.common.ui.unmapped.singlecard.LeadingSection
import pl.gov.coi.common.ui.unmapped.singlecard.MediaSection
import pl.gov.coi.common.ui.unmapped.singlecard.SingleCardLabel
import pl.gov.coi.common.ui.utils.textWithDotAndSpaceOrEmpty

data class FilePickerData(
  val addFileLabel: Label,
  val errorLabel: Label?,
  val files: List&lt;PickerFile&gt;,
  val requirements: List&lt;Label&gt;,
  val onAddFileClicked: () -&gt; Unit,
  val maxAllowedFiles: Int,
) {
  internal val cardsData = files.map { file -&gt; file.cardData }

  internal val combinedRequirements = requirements.reduce { combinedRequirements, requirement -&gt;
    combinedRequirements + Label.SPACE + requirement
  }

  internal val addFileCardData = DefaultSingleCardData(
    leadingSection = LeadingSection(
      mediaSection = MediaSection.Icon(
        iconResId = R.drawable.ab016_add,
        iconColor = { AppTheme.colors.primary900 },
      ),
    ),
    bodySection = BodySection(
      title = BodyTitleSection.Title(
        singleCardLabel = SingleCardLabel(
          label = addFileLabel,
          labelColor = { AppTheme.colors.primary900 },
          contentDescription = contentDescription().toLabel(&quot;filePicker_contentDescription&quot;),
        ),
      ),
    ),
    onClick = onAddFileClicked,
  )
}

private fun FilePickerData.contentDescription() =
  (addFileLabel.textWithDotAndSpaceOrEmpty() +
    combinedRequirements.textWithDotAndSpaceOrEmpty() +
    errorLabel.textWithDotAndSpaceOrEmpty()).trim()

internal val FilePickerData.showAddButton
  get() = files.size &lt; maxAllowedFiles

internal val FilePickerData.showError
  get() = errorLabel != null
