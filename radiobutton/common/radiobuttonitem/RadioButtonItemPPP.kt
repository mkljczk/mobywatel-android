package pl.gov.coi.common.ui.ds.radiobutton.common.radiobuttonitem

import android.content.Context
import pl.gov.coi.common.domain.Mapper
import pl.gov.coi.common.ui.preview.CustomWrappedDataPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestDataProvider
import pl.gov.coi.common.ui.preview.WrappedValue
import pl.gov.coi.common.ui.ds.radiobutton.common.model.RadioButtonItemData

class RadioButtonItemPPP : CustomWrappedDataPreviewParameterProvider&lt;
  Unit,
  RadioButtonItemData?,
  Mapper&lt;Unit, RadioButtonItemData?&gt;,
  RadioButtonItemData,
  &gt;() {

  override fun mapper(context: Context) = object : Mapper&lt;Unit, RadioButtonItemData?&gt; {
    override fun invoke(p1: Unit): RadioButtonItemData? = null
  }

  override val screenShotTestValues: Sequence&lt;ScreenShotTestDataProvider&lt;RadioButtonItemData&gt;&gt; = sequenceOf(
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonItemUnselected&quot;,
      wrappedValue = WrappedValue {
        provideRadioButtonItemData(
          enabled = true,
          isSelected = false,
          isError = false,
        )
      },
    ),
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonItemUnselectedDisabled&quot;,
      wrappedValue = WrappedValue {
        provideRadioButtonItemData(
          enabled = false,
          isSelected = false,
          isError = false,
        )
      },
    ),
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonItemSelected&quot;,
      wrappedValue = WrappedValue {
        provideRadioButtonItemData(
          enabled = true,
          isSelected = true,
          isError = false,
        )
      },
    ),
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonItemSelectedDisabled&quot;,
      wrappedValue = WrappedValue {
        provideRadioButtonItemData(
          enabled = false,
          isSelected = true,
          isError = false,
        )
      },
    ),
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonItemUnselectedError&quot;,
      wrappedValue = WrappedValue {
        provideRadioButtonItemData(
          enabled = true,
          isSelected = false,
          isError = true,
        )
      },
    ),
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonItemSelectedError&quot;,
      wrappedValue = WrappedValue {
        provideRadioButtonItemData(
          enabled = true,
          isSelected = true,
          isError = true,
        )
      },
    ),
  )

  private fun provideRadioButtonItemData(
    enabled: Boolean,
    isSelected: Boolean,
    isError: Boolean,
  ) = RadioButtonItemData(
    enabled = enabled,
    isSelected = isSelected,
    isError = isError,
  )
}
