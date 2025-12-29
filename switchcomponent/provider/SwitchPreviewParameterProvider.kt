package pl.gov.coi.common.ui.ds.switchcomponent.provider

import pl.gov.coi.common.domain.validators.ValidationState
import pl.gov.coi.common.ui.ds.button.buttontext.ButtonTextData
import pl.gov.coi.common.ui.ds.link.LinkData
import pl.gov.coi.common.ui.ds.switchcomponent.SwitchData
import pl.gov.coi.common.ui.ds.switchcomponent.SwitchExtraType
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class SwitchPreviewParameterProvider : CustomPreviewParameterProvider&lt;SwitchData&gt;() {

  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;SwitchData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;SwitchEnabledStateOFF&quot;,
      value = SwitchData.SwitchOnly(
        checked = false,
        onCheckedChange = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SwitchEnabledStateON&quot;,
      value = SwitchData.SwitchOnly(
        checked = true,
        onCheckedChange = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SwitchDisabledStateOFF&quot;,
      value = SwitchData.SwitchOnly(
        enabled = false,
        checked = false,
        onCheckedChange = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SwitchDisabledStateON&quot;,
      value = SwitchData.SwitchOnly(
        checked = true,
        enabled = false,
        onCheckedChange = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SwitchWithShortText&quot;,
      value = SwitchData.SwitchWithText(
        label = &quot;Krótka  treść&quot;.toLabel(),
        checked = false,
        onCheckedChange = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SwitchWithLongTextInvalid&quot;,
      value = SwitchData.SwitchWithText(
        label = &quot;Switch component longer description, Lorem ipsum dolor sit amet, consectetur adipiscing elit&quot;
          .toLabel(),
        onCheckedChange = {},
        checked = false,
        validationState = ValidationState.Invalid(
          message = &quot;Komunikat walidacyjny&quot;.toLabel(),
        ),
      ),
    ),

    ScreenShotTestData(
      screenShotTestName = &quot;SwitchWithLink&quot;,
      value = SwitchData.SwitchWithExtras(
        checked = true,
        enabled = true,
        onCheckedChange = { },
        label = &quot;Switch with link&quot;.toLabel(),
        customActionContentDescription = &quot;Pobierz Switch with link&quot;.toLabel(),
        type = SwitchExtraType.Link(
          data = LinkData(
            label = &quot;Link&quot;.toLabel(),
            linkType = LinkData.LinkType.WEBSITE,
            url = &quot;&quot;,
            onClick = {},
          ),
        ),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SwitchWithButtonText&quot;,
      value = SwitchData.SwitchWithExtras(
        checked = true,
        enabled = true,
        onCheckedChange = { },
        label = &quot;Switch with text button&quot;.toLabel(),
        customActionContentDescription = &quot;Zobacz&quot;.toLabel(),
        type = SwitchExtraType.TextButton(
          data = ButtonTextData(
            label = &quot;button text label&quot;.toLabel(),
            onClick = {},
          ),
        ),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SwitchWithLinkInvalid&quot;,
      value = SwitchData.SwitchWithExtras(
        checked = true,
        enabled = true,
        onCheckedChange = { },
        label = &quot;Switch with link&quot;.toLabel(),
        type = SwitchExtraType.Link(
          data = LinkData(
            label = &quot;Link&quot;.toLabel(),
            linkType = LinkData.LinkType.EXTERNAL_APP,
            url = &quot;&quot;,
            onClick = {},
          ),
        ),
        validationState = ValidationState.Invalid(
          message = &quot;Komunikat walidacyjny&quot;.toLabel(),
        ),
        customActionContentDescription = &quot;Pobierz Switch with link&quot;.toLabel(),
      ),
    ),
  )
}
