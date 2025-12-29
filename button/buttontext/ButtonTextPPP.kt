package pl.gov.coi.common.ui.ds.button.buttontext

import pl.gov.coi.common.ui.ds.button.common.ButtonState
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class ButtonTextPPP : CustomPreviewParameterProvider&lt;ButtonTextData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;ButtonTextData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;TextEnabledButton&quot;,
      value = ButtonTextData(
        label = &quot;Test&quot;.toLabel(),
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextDestructiveButton&quot;,
      value = ButtonTextData(
        label = &quot;Test&quot;.toLabel(),
        buttonState = ButtonState.Destructive,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextDisabledButton&quot;,
      value = ButtonTextData(
        label = &quot;Test&quot;.toLabel(),
        buttonState = ButtonState.Disabled,
        onClick = {},
      ),
    ),
  )
}
