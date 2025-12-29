package pl.gov.coi.common.ui.ds.emptystate.provider

import pl.gov.coi.common.ui.ds.button.ButtonData
import pl.gov.coi.common.ui.ds.button.common.ButtonSize
import pl.gov.coi.common.ui.ds.button.common.ButtonType
import pl.gov.coi.common.ui.ds.button.common.ButtonVariant
import pl.gov.coi.common.ui.ds.emptystate.EmptyStateData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class EmptyStatePreviewParameterProvider : CustomPreviewParameterProvider&lt;EmptyStateData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;EmptyStateData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;EmptyStateDataNoTitle&quot;,
      value = provideEmptyStateDataNoTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;EmptyStateStateDataWithTitle&quot;,
      value = provideEmptyStateDataWithTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;EmptyStateDataStandardWithButton&quot;,
      value = provideEmptyStateDataWithButton(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;EmptyStateDataNoTitleWithButton&quot;,
      value = provideEmptyStateDataNoTitleWithButton(),
    ),
  )

  private fun provideEmptyStateDataWithTitle() = EmptyStateData(
    title = &quot;Title section (optional)&quot;.toLabel(),
    body = &quot;Body section&quot;.toLabel(),
  )

  private fun provideEmptyStateDataNoTitle() = EmptyStateData(
    body = &quot;Body section&quot;.toLabel(),
  )

  private fun provideEmptyStateDataWithButton() = EmptyStateData(
    title = &quot;Title section (optional)&quot;.toLabel(),
    body = &quot;Body section&quot;.toLabel(),
    buttonData = ButtonData(
      buttonSize = ButtonSize.Small,
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Tertiary small button (optional)&quot;.toLabel(),
      ),
      onClick = {},
    ),
  )

  private fun provideEmptyStateDataNoTitleWithButton() = EmptyStateData(
    body = &quot;Body section&quot;.toLabel(),
    buttonData = ButtonData(
      buttonSize = ButtonSize.Small,
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Tertiary small button (optional)&quot;.toLabel(),
      ),
      onClick = {},
    ),
  )
}
