package pl.gov.coi.common.ui.ds.checkbox.single

import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.ds.button.buttontext.ButtonTextData
import pl.gov.coi.common.ui.ds.checkbox.common.model.CheckBoxRowData
import pl.gov.coi.common.ui.ds.checkbox.common.model.CheckBoxType
import pl.gov.coi.common.ui.ds.checkbox.common.model.CheckboxContentType
import pl.gov.coi.common.ui.ds.checkbox.common.model.ClickableTextData
import pl.gov.coi.common.ui.ds.checkbox.single.model.CheckBoxSingleData
import pl.gov.coi.common.ui.ds.link.LinkData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class CheckBoxSinglePPP : CustomPreviewParameterProvider&lt;CheckBoxSingleData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;CheckBoxSingleData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;Default&quot;,
      value = CheckBoxSingleData(
        checkbox = getCheckBoxData(),
        type = CheckBoxType.Default,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;HelperText&quot;,
      value = CheckBoxSingleData(
        checkbox = getCheckBoxData(isChecked = true),
        type = CheckBoxType.Helper(helperText = &quot;helper text&quot;.toLabel()),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ErrorText&quot;,
      value = CheckBoxSingleData(
        checkbox = getCheckBoxData(isChecked = true),
        type = CheckBoxType.Error(errorText = &quot;error text&quot;.toLabel()),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;Disabled&quot;,
      value = CheckBoxSingleData(
        isEnabled = false,
        checkbox = getCheckBoxData(isChecked = true),
        type = CheckBoxType.Error(errorText = &quot;error text&quot;.toLabel()),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ContentBox&quot;,
      value = CheckBoxSingleData(
        checkbox = getCheckBoxData(),
        type = CheckBoxType.Helper(helperText = &quot;helper text&quot;.toLabel()),
        contentType = CheckboxContentType.CONTENT_BOX,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;Url&quot;,
      value = CheckBoxSingleData(
        checkbox = getCheckBoxData(
          clickableTextData = ClickableTextData.Link(
            linkData = LinkData(
              label = &quot;urlText&quot;.toLabel(),
              url = &quot;url&quot;,
              linkType = LinkData.LinkType.WEBSITE,
              onClick = { url -&gt; println(&quot;Checkbox $url clicked&quot;) },
            ),
          ),
        ),
        contentType = CheckboxContentType.CONTENT_BOX,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;CheckBoxTextButton&quot;,
      value = CheckBoxSingleData(
        checkbox = getCheckBoxData(
          clickableTextData = ClickableTextData.Button(
            buttonData = ButtonTextData(
              label = &quot;textButton&quot;.toLabel(),
              onClick = { println(&quot;buttonText clicked&quot;) },
            ),
          ),
        ),
        contentType = CheckboxContentType.CONTENT_BOX,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;UrlWithError&quot;,
      value = CheckBoxSingleData(
        checkbox = getCheckBoxData(
          clickableTextData = ClickableTextData.Link(
            linkData = LinkData(
              label = &quot;urlText&quot;.toLabel(),
              url = &quot;url&quot;,
              linkType = LinkData.LinkType.WEBSITE,
              onClick = { url -&gt; println(&quot;Checkbox $url clicked&quot;) },
            ),
          ),
        ),
        type = CheckBoxType.Error(errorText = &quot;error text&quot;.toLabel()),
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
}
