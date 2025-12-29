package pl.gov.coi.common.ui.ds.dropdownbutton

import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class DropDownButtonPPP : CustomPreviewParameterProvider&lt;DropDownButtonData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;DropDownButtonData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;DisabledDropDown&quot;,
      value = DropDownButtonData(
        &quot;Dropdown Label&quot;.toLabel(),
        placeholder = &quot;DropDown placeholder placeholder placeholder&quot;.toLabel(),
        items = emptyList(),
        initialSelectedItem = null,
        buttonType = DropDownButtonState.Disabled(
          helperText = &quot;helper text&quot;.toLabel(),
        ),
        onClick = { },
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;HelperDropDown&quot;,
      value = DropDownButtonData(
        &quot;Dropdown Label&quot;.toLabel(),
        placeholder = &quot;DropDown placeholder placeholder placee&quot;.toLabel(),
        items = emptyList(),
        initialSelectedItem = null,
        buttonType = DropDownButtonState.Enabled(
          helperText = &quot;helper text&quot;.toLabel(),
        ),
        onClick = { },
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ErrorDropDown&quot;,
      value = DropDownButtonData(
        &quot;Dropdown Label&quot;.toLabel(),
        placeholder = &quot;DropDown placeholder&quot;.toLabel(),
        items = emptyList(),
        initialSelectedItem = null,
        buttonType = DropDownButtonState.Error(
          errorText = &quot;error text&quot;.toLabel(),
        ),
        onClick = { },
      ),
    ),
  )
}
