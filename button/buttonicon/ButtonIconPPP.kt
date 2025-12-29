package pl.gov.coi.common.ui.ds.button.buttonicon

import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class ButtonIconPPP : CustomPreviewParameterProvider&lt;ButtonIconData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;ButtonIconData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;IconButton&quot;,
      value = ButtonIconData(
        iconResId = R.drawable.aa002_delete,
        onClick = {},
      ),
    ),
  )
}
