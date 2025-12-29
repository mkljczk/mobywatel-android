package pl.gov.coi.common.ui.ds.checkbox.group

import pl.gov.coi.common.ui.ds.button.buttontext.ButtonTextData
import pl.gov.coi.common.ui.ds.checkbox.common.model.CheckBoxRowData
import pl.gov.coi.common.ui.ds.checkbox.common.model.CheckBoxType
import pl.gov.coi.common.ui.ds.checkbox.common.model.CheckboxContentType
import pl.gov.coi.common.ui.ds.checkbox.common.model.ClickableTextData
import pl.gov.coi.common.ui.ds.checkbox.group.model.CheckBoxGroupData
import pl.gov.coi.common.ui.ds.checkbox.group.model.CheckBoxHeaderData
import pl.gov.coi.common.ui.ds.link.LinkData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class GroupCheckBoxPPP : CustomPreviewParameterProvider&lt;CheckBoxGroupData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;CheckBoxGroupData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;CheckboxGroup&quot;,
      value = CheckBoxGroupData(
        checkboxes = listOf(
          getCheckBoxData(isChecked = true),
          getCheckBoxData(),
        ),
        getCheckBoxHeader(),
        type = CheckBoxType.Default,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;CheckboxesWithErrorText&quot;,
      value = CheckBoxGroupData(
        checkboxes = listOf(
          getCheckBoxData(),
          getCheckBoxData(),
        ),
        getCheckBoxHeader(),
        type = CheckBoxType.Error(errorText = &quot;errorText&quot;.toLabel()),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;CheckboxesWithHelperText&quot;,
      value = CheckBoxGroupData(
        checkboxes = listOf(
          getCheckBoxData(),
          getCheckBoxData(),
        ),
        getCheckBoxHeader(),
        type = CheckBoxType.Helper(helperText = &quot;Helper text&quot;.toLabel()),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;CheckboxesUrl&quot;,
      value = CheckBoxGroupData(
        checkboxes = listOf(
          getCheckBoxData(isChecked = true),
          getCheckBoxData(
            clickableTextData = ClickableTextData.Link(
              linkData = LinkData(
                label = &quot;urlText&quot;.toLabel(),
                url = &quot;url&quot;,
                onClick = { url -&gt; println(&quot;Checkbox $url clicked&quot;) },
                linkType = LinkData.LinkType.WEBSITE,
              ),
            ),
          ),
        ),
        type = CheckBoxType.Default,
        header = getCheckBoxHeader(),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;CheckboxesTextButton&quot;,
      value = CheckBoxGroupData(
        checkboxes = listOf(
          getCheckBoxData(isChecked = true),
          getCheckBoxData(
            clickableTextData = ClickableTextData.Button(
              buttonData = ButtonTextData(
                label = &quot;text button&quot;.toLabel(),
                onClick = {},
              ),
            ),
          ),
        ),
        type = CheckBoxType.Default,
        header = getCheckBoxHeader(),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;CheckboxesContentWithError&quot;,
      value = CheckBoxGroupData(
        header = getCheckBoxHeader(),
        checkboxes = listOf(
          getCheckBoxData(isChecked = true),
          getCheckBoxData(),
        ),
        type = CheckBoxType.Error(
          errorText = (&quot;Lorem ipsum dolor sit amet, consectetur &quot; +
            &quot;adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore &quot; +
            &quot;magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation &quot;).toLabel(),
        ),
        contentType = CheckboxContentType.CONTENT_BOX,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;CheckboxesDisabled&quot;,
      value = CheckBoxGroupData(
        checkboxes = listOf(
          getCheckBoxData(isChecked = true),
          getCheckBoxData(isChecked = true),
          getCheckBoxData(),
        ),
        header = getCheckBoxHeader(),
        type = CheckBoxType.Error(errorText = &quot;Error text&quot;.toLabel()),
        isEnabled = false,
      ),
    ),
  )

  private fun getCheckBoxData(
    isChecked: Boolean = false,
    clickableTextData: ClickableTextData? = null,
  ) = CheckBoxRowData(
    isChecked = isChecked,
    onCheckedChange = {},
    label = &quot;Checkbox label&quot;.toLabel(),
    clickableTextData = clickableTextData,
  )

  private fun getCheckBoxHeader() = CheckBoxHeaderData(
    label = &quot;Checkbox group Label&quot;.toLabel(),
    onClick = {},
  )
}
