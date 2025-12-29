package pl.gov.coi.common.ui.ds.controllers.provider

import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.ds.controllers.ControllersData

class ControllerSwitchPreviewParameterProvider : CustomPreviewParameterProvider&lt;ControllersData.Switch&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;ControllersData.Switch&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;ControllerSwitchTabLeftSelected&quot;,
      value = provideControllerSwitchTabLeftSelectedPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ControllerSwitchTabRightSelected&quot;,
      value = provideControllerSwitchTabRightSelectedPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ControllerSwitchTab&quot;,
      value = provideControllerSwitchTabLongLabelsPreviewData(),
    ),
  )

  private fun provideControllerSwitchTabLeftSelectedPreviewData() =
    ControllersData.Switch(
      leftItem = ControllersData.Switch.TabItem(
        label = &quot;Left&quot;.toLabel(),
        type = ControllersData.Switch.Type.LEFT,
      ),
      rightItem = ControllersData.Switch.TabItem(
        label = &quot;Right&quot;.toLabel(),
        type = ControllersData.Switch.Type.RIGHT,
      ),
      selectedItemType = ControllersData.Switch.Type.LEFT,
      onClick = {},
    )

  private fun provideControllerSwitchTabRightSelectedPreviewData() =
    ControllersData.Switch(
      leftItem = ControllersData.Switch.TabItem(
        label = &quot;Left&quot;.toLabel(),
        type = ControllersData.Switch.Type.LEFT,
      ),
      rightItem = ControllersData.Switch.TabItem(
        label = &quot;Right&quot;.toLabel(),
        type = ControllersData.Switch.Type.RIGHT,
      ),
      selectedItemType = ControllersData.Switch.Type.RIGHT,
      onClick = {},
    )

  private fun provideControllerSwitchTabLongLabelsPreviewData() =
    ControllersData.Switch(
      leftItem = ControllersData.Switch.TabItem(
        label = &quot;Zaległe i nieopłacone mandaty&quot;.toLabel(),
        type = ControllersData.Switch.Type.LEFT,
      ),
      rightItem = ControllersData.Switch.TabItem(
        label = &quot;Opłacone mandaty&quot;.toLabel(),
        type = ControllersData.Switch.Type.RIGHT,
      ),
      selectedItemType = ControllersData.Switch.Type.LEFT,
      onClick = {},
    )
}
