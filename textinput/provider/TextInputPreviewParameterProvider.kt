package pl.gov.coi.common.ui.ds.textinput.provider

import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.domain.validators.ValidationState
import pl.gov.coi.common.ui.ds.button.buttontext.ButtonTextData
import pl.gov.coi.common.ui.ds.textinput.model.TextInputData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class TextInputPreviewParameterProvider : CustomPreviewParameterProvider&lt;TextInputData&gt;() {

  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;TextInputData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputText&quot;,
      value = provideTextInputText(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputTextWithOptionals&quot;,
      value = provideTextInputTextWithOptionals(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputTextError&quot;,
      value = provideTextInputTextError(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputTextDisabled&quot;,
      value = provideTextInputTextDisabled(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputNumber&quot;,
      value = provideTextInputNumber(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputPassword&quot;,
      value = provideTextInputPassword(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputSearch&quot;,
      value = provideTextInputSearch(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputPin&quot;,
      value = provideTextInputPin(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputPinError&quot;,
      value = provideTextInputPinError(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputPinDisabled&quot;,
      value = provideTextInputPinDisabled(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputPhoneNumberFilled&quot;,
      value = provideTextInputPhoneNumberFilled(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputPhoneNumberInvalidNumber&quot;,
      value = provideTextInputPhoneNumberInvalidNumber(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputPhoneNumberInvalidPrefix&quot;,
      value = provideTextInputPhoneNumberInvalidCountryCode(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputPhoneNumberLong&quot;,
      value = provideTextInputPhoneNumberLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;TextInputSearchLong&quot;,
      value = provideTextInputSearchLong(),
    ),
  )

  private fun provideTextInputText() = TextInputData.Text(
    label = &quot;Etykieta&quot;.toLabel(),
    value = Label.EMPTY,
    onValueChanged = {},
  )

  private fun provideTextInputTextWithOptionals() = TextInputData.Text(
    label = &quot;Etykieta&quot;.toLabel(),
    hint = &quot;Tekst zastępczy (hint)&quot;.toLabel(),
    value = Label.EMPTY,
    helperText = &quot;Tekst pomocniczy (helper text)&quot;.toLabel(),
    infoButtonData = ButtonTextData(
      label = &quot;Info button&quot;.toLabel(),
      onClick = {},
    ),
    onValueChanged = {},
  )

  private fun provideTextInputTextError() = TextInputData.Text(
    label = &quot;Etykieta&quot;.toLabel(),
    hint = &quot;Tekst zastępczy (hint)&quot;.toLabel(),
    value = Label.EMPTY,
    validationState = ValidationState.Invalid(
      message = &quot;Tekst błędu&quot;.toLabel(),
    ),
    helperText = null,
    infoButtonData = null,
    onValueChanged = {},
  )

  private fun provideTextInputTextDisabled() = TextInputData.Text(
    label = &quot;Etykieta&quot;.toLabel(),
    hint = &quot;Tekst zastępczy (hint)&quot;.toLabel(),
    value = Label.EMPTY,
    helperText = &quot;Tekst pomocniczy (helper text)&quot;.toLabel(),
    infoButtonData = null,
    enabled = false,
    onValueChanged = {},
  )

  private fun provideTextInputNumber() = TextInputData.Number(
    label = &quot;Etykieta&quot;.toLabel(),
    hint = &quot;Tekst zastępczy (hint)&quot;.toLabel(),
    value = &quot;1234&quot;.toLabel(),
    onValueChanged = {},
  )

  private fun provideTextInputPassword() = TextInputData.Password(
    label = &quot;Hasło&quot;.toLabel(),
    value = &quot;123&quot;.toLabel(),
    onValueChanged = {},
  )

  private fun provideTextInputSearch() = TextInputData.Search(
    hint = &quot;Wyszukaj (hint)&quot;.toLabel(),
    value = Label.EMPTY,
    onValueChanged = {},
  )

  private fun provideTextInputPin() = TextInputData.Pin(
    label = &quot;Etykieta&quot;.toLabel(),
    value = &quot;123&quot;.toLabel(),
    onValueChanged = {},
  )

  private fun provideTextInputPinError() = TextInputData.Pin(
    label = &quot;Etykieta&quot;.toLabel(),
    value = &quot;1234&quot;.toLabel(),
    validationState = ValidationState.Invalid(
      message = &quot;Tekst błędu&quot;.toLabel(),
    ),
    onValueChanged = {},
  )

  private fun provideTextInputPinDisabled() = TextInputData.Pin(
    label = &quot;Etykieta&quot;.toLabel(),
    value = &quot;1234&quot;.toLabel(),
    enabled = false,
    onValueChanged = {},
  )

  private fun provideTextInputPhoneNumberFilled() = TextInputData.PhoneNumber(
    label = &quot;Numer telefonu&quot;.toLabel(),
    countryCodeValue = &quot;+48&quot;.toLabel(),
    phoneNumberValue = &quot;123456789&quot;.toLabel(),
    onCountryCodeChanged = {},
    onPhoneNumberChanged = {},
    isCountryCodeCorrect = null,
    isPhoneNumberCorrect = null,
    validationState = ValidationState.Default,
  )

  private fun provideTextInputPhoneNumberInvalidNumber() = TextInputData.PhoneNumber(
    label = &quot;Numer telefonu&quot;.toLabel(),
    countryCodeValue = &quot;+48&quot;.toLabel(),
    phoneNumberValue = &quot;12345&quot;.toLabel(),
    onCountryCodeChanged = {},
    onPhoneNumberChanged = {},
    isCountryCodeCorrect = null,
    isPhoneNumberCorrect = false,
    validationState = ValidationState.Invalid(message = &quot;Niepoprawny numer&quot;.toLabel()),
  )

  private fun provideTextInputPhoneNumberInvalidCountryCode() = TextInputData.PhoneNumber(
    label = &quot;Numer telefonu&quot;.toLabel(),
    countryCodeValue = &quot;+48&quot;.toLabel(),
    phoneNumberValue = &quot;12345&quot;.toLabel(),
    onCountryCodeChanged = {},
    onPhoneNumberChanged = {},
    isCountryCodeCorrect = false,
    isPhoneNumberCorrect = true,
    validationState = ValidationState.Invalid(message = &quot;Niepoprawny prefix&quot;.toLabel()),
  )

  private fun provideTextInputPhoneNumberLong() = TextInputData.PhoneNumber(
    label = &quot;Numer telefonu&quot;.toLabel(),
    countryCodeValue = &quot;+48&quot;.toLabel(),
    phoneNumberValue = &quot;123456789123456789123456789&quot;.toLabel(),
    onCountryCodeChanged = {},
    onPhoneNumberChanged = {},
    isCountryCodeCorrect = null,
    isPhoneNumberCorrect = null,
    validationState = ValidationState.Default,
  )

  private fun provideTextInputSearchLong() = TextInputData.Search(
    hint = &quot;Wyszukaj (hint)&quot;.toLabel(),
    value = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.&quot;.toLabel(),
    onValueChanged = {},
  )
}
