package pl.gov.coi.common.ui.ds.progressbar.provider

import pl.gov.coi.common.ui.ds.progressbar.ProgressBarData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class ProgressBarPreviewParameterProvider : CustomPreviewParameterProvider&lt;ProgressBarData&gt;() {

  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;ProgressBarData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;ProgressBar&quot;,
      value = ProgressBarData.Bar(value = 50),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ProgressBarWithOptionalLabel&quot;,
      value = ProgressBarData.IndicatorBar(value = 75, label = &quot;75%&quot;.toLabel()),
    ),
  )
}
