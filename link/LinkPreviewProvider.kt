package pl.gov.coi.common.ui.ds.link

import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class LinkPreviewProvider : CustomPreviewParameterProvider&lt;LinkData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;LinkData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;LinkEnabled&quot;,
      value = LinkData(
        label = &quot;Link&quot;.toLabel(),
        linkType = LinkData.LinkType.WEBSITE,
        url = &quot;&quot;,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;LinkDisabled&quot;,
      value = LinkData(
        label = &quot;Link&quot;.toLabel(),
        linkType = LinkData.LinkType.WEBSITE,
        url = &quot;&quot;,
        enabled = false,
        onClick = {},
      ),
    ),
  )
}
