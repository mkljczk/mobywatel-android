package pl.gov.coi.common.ui.ds.snackbar.provider

import pl.gov.coi.common.ui.ds.snackbar.SnackBarData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class SnackBarPreviewParameterProvider : CustomPreviewParameterProvider&lt;SnackBarData&gt;() {

  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;SnackBarData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;SnackBarDataSimple&quot;,
      value = SnackBarData.Default(
        messageLabel = &quot;Single-line snackbar&quot;.toLabel(),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SnackBarDataSimple&quot;,
      value = SnackBarData.Default(
        (&quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laore&quot;).toLabel(),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SnackBarDataClosable&quot;,
      value = SnackBarData.DefaultWithIcon(
        messageLabel = &quot;Single-line snackbar with close affordance&quot;.toLabel(),
      ) {},
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SnackBarDataClosable&quot;,
      value = SnackBarData.DefaultWithIcon(
        (&quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laore&quot;).toLabel(),
      ) {},
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SnackBarDataDefaultWithIcon&quot;,
      value = SnackBarData.DefaultWithIcon(
        (&quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laore.&quot; +
          &quot; Lorem ipsum dolor sit amet.&quot;).toLabel(),
      ),
    ),
  )
}
