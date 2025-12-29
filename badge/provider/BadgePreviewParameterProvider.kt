package pl.gov.coi.common.ui.ds.badge.provider

import pl.gov.coi.common.ui.ds.badge.BadgeData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class BadgePreviewParameterProvider : CustomPreviewParameterProvider&lt;BadgeData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;BadgeData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;BadgeDataDefault&quot;,
      value = BadgeData.BadgeDefault,
    ),
  )
}
