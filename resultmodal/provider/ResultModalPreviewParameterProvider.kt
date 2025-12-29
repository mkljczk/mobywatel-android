package pl.gov.coi.common.ui.ds.resultmodal.provider

import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.button.ButtonData
import pl.gov.coi.common.ui.ds.button.common.ButtonSize
import pl.gov.coi.common.ui.ds.button.common.ButtonType
import pl.gov.coi.common.ui.ds.button.common.ButtonVariant
import pl.gov.coi.common.ui.ds.resultmodal.ResultModalData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.theme.AppTheme

class ResultModalPreviewParameterProvider : CustomPreviewParameterProvider&lt;ResultModalData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;ResultModalData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;ResultModalData&quot;,
      value = provideResultModalData(),
    ),
  )

  private fun provideResultModalData() = ResultModalData(
    iconRes = R.drawable.f4_success,
    iconColorProvider = { AppTheme.colors.supportGreen100 },
    iconContentDescription = Label.EMPTY,
    title = &quot;Title Roboto Medium 20&quot;.toLabel(),
    dataTitle1 = &quot;Data title 2 Roboto Regular 16&quot;.toLabel(),
    data1 = &quot;Data 1 Roboto Medium 18\nData 1 Roboto Medium 18&quot;.toLabel(),
    dataTitle2 = &quot;Data title 2 Roboto Regular 16&quot;.toLabel(),
    data2 = &quot;Data 2 Roboto Medium 18&quot;.toLabel(),
    primaryButton = ButtonData(
      buttonSize = ButtonSize.Large(),
      buttonVariant = ButtonVariant.Primary,
      buttonType = ButtonType.WithText(
        label = &quot;Primary button&quot;.toLabel(),
      ),
      onClick = {},
    ),
    secondaryButton = ButtonData(
      buttonSize = ButtonSize.Large(),
      buttonVariant = ButtonVariant.Secondary(),
      buttonType = ButtonType.WithText(
        label = &quot;Secondary button&quot;.toLabel(),
      ),
      onClick = {},
    ),
    tertiaryButton = ButtonData(
      buttonSize = ButtonSize.Large(),
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Tertiary button&quot;.toLabel(),
      ),
      onClick = {},
    ),
    closeIconContentDescription = Label.EMPTY,
    closeAction = {},
  )
}
