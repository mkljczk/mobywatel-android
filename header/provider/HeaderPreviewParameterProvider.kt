package pl.gov.coi.common.ui.ds.header.provider

import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.header.HeaderData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.theme.AppTheme

class HeaderPreviewParameterProvider : CustomPreviewParameterProvider&lt;HeaderData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;HeaderData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;Header&quot;,
      value = HeaderData(
        iconResId = R.drawable.da015_historia_pojazdu,
        iconColorProvider = { AppTheme.colors.headerCeladon100 },
        iconBackgroundColorProvider = { AppTheme.colors.headerGrass30 },
        title = &quot;Title Size XXL Color - black 900&quot;.toLabel(),
        message = &quot;Description text Size - M, Color - grey 900&quot;.toLabel(),
      ),
    ),
  )
}
