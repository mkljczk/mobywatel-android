package pl.gov.coi.common.ui.ds.inputdatetime.provider

import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.domain.validators.ValidationState
import pl.gov.coi.common.ui.ds.inputdatetime.InputDateTimeData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class InputDateTimePreviewParameterProvider : CustomPreviewParameterProvider&lt;InputDateTimeData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;InputDateTimeData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;InputDateEnabledPlaceholder&quot;,
      value = provideInputDateEnabledPlaceholderPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;InputDateEnabledSelectedDate&quot;,
      value = provideInputDateEnabledSelectedDatePreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;InputDateErrorPlaceholder&quot;,
      value = provideInputDateErrorPlaceholderPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;InputDateErrorSelectedDate&quot;,
      value = provideInputDateErrorSelectedDatePreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;InputDateErrorLongMessage&quot;,
      value = provideInputDateErrorLongMessagePreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;InputDateDisabledPlaceholder&quot;,
      value = provideInputDateDisabledPlaceholderPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;InputDateDisabledSelectedDate&quot;,
      value = provideInputDateDisabledSelectedDatePreviewData(),
    ),
  )
}

fun provideInputDateEnabledPlaceholderPreviewData() =
  InputDateTimeData(
    label = &quot;Label&quot;.toLabel(&quot;&quot;),
    helperText = &quot;Helper text.&quot;.toLabel(&quot;&quot;),
    type = InputDateTimeData.Type.Date,
    onClick = {},
  )

fun provideInputDateEnabledSelectedDatePreviewData() =
  InputDateTimeData(
    inputText = &quot;29.04.2024&quot;,
    label = &quot;Label&quot;.toLabel(&quot;&quot;),
    type = InputDateTimeData.Type.Date,
    helperText = &quot;Helper text.&quot;.toLabel(&quot;&quot;),
    onClick = {},
  )

fun provideInputDateErrorPlaceholderPreviewData() =
  InputDateTimeData(
    label = &quot;Label&quot;.toLabel(&quot;&quot;),
    helperText = &quot;Helper text.&quot;.toLabel(&quot;&quot;),
    type = InputDateTimeData.Type.Date,
    validationState = ValidationState.Invalid(
      message = &quot;Error text.&quot;.toLabel(&quot;&quot;),
    ),
    onClick = {},
  )

fun provideInputDateErrorSelectedDatePreviewData() =
  InputDateTimeData(
    inputText = &quot;29.04.2024&quot;,
    label = &quot;Label&quot;.toLabel(&quot;&quot;),
    type = InputDateTimeData.Type.Date,
    helperText = &quot;Helper text.&quot;.toLabel(&quot;&quot;),
    validationState = ValidationState.Invalid(
      message = &quot;Error text.&quot;.toLabel(&quot;&quot;),
    ),
    onClick = {},
  )

fun provideInputDateErrorLongMessagePreviewData() =
  InputDateTimeData(
    inputText = &quot;29.04.2024&quot;,
    label = &quot;Label&quot;.toLabel(&quot;&quot;),
    type = InputDateTimeData.Type.Date,
    helperText = &quot;Helper text.&quot;.toLabel(&quot;&quot;),
    validationState = ValidationState.Invalid(
      message = (&quot;Podczas walidacji tekst pomocniczy zostaje zastąpiony tekstem błędu (komponent validation error). &quot; +
        &quot;Validation error dla komunikatu o długości powyżej jednej linii.&quot;).toLabel(&quot;&quot;),
    ),
    onClick = {},
  )

fun provideInputDateDisabledPlaceholderPreviewData() =
  InputDateTimeData(
    label = &quot;Label&quot;.toLabel(&quot;&quot;),
    type = InputDateTimeData.Type.Date,
    helperText = &quot;Helper text.&quot;.toLabel(&quot;&quot;),
    enabled = false,
    onClick = {},
  )

fun provideInputDateDisabledSelectedDatePreviewData() =
  InputDateTimeData(
    inputText = &quot;29.04.2024&quot;,
    label = &quot;Label&quot;.toLabel(&quot;&quot;),
    type = InputDateTimeData.Type.Date,
    helperText = &quot;Helper text.&quot;.toLabel(&quot;&quot;),
    enabled = false,
    onClick = {},
  )
