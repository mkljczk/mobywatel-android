package pl.gov.coi.common.ui.ds.controllers.provider

import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.ds.controllers.ControllersData

class ControllerFilterPreviewParameterProvider : CustomPreviewParameterProvider&lt;ControllersData.Filter&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;ControllersData.Filter&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;ControllerFilterFirstSelected&quot;,
      value = provideControllerFilterFirstSelectedPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ControllerFilterThirdSelected&quot;,
      value = provideControllerFilterThirdSelectedPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ControllerFilterShortLabel&quot;,
      value = provideControllerFilterShortLabelPreviewData(),
    ),
  )
}

private fun provideControllerFilterFirstSelectedPreviewData() =
  ControllersData.Filter(
    items = listOf(
      &quot;Główne&quot;,
      &quot;Tymczasowe&quot;,
      &quot;Niezdeklarowane&quot;,
      &quot;Nieważne&quot;,
    ).map { it.toLabel(tag = it) },
    selectedItemIndex = 0,
    onClick = {},
  )

private fun provideControllerFilterThirdSelectedPreviewData() =
  ControllersData.Filter(
    items = listOf(
      &quot;Główne&quot;,
      &quot;Tymczasowe&quot;,
      &quot;Niezdeklarowane&quot;,
      &quot;Nieważne&quot;,
    ).map { it.toLabel(tag = it) },
    selectedItemIndex = 2,
    onClick = {},
  )

private fun provideControllerFilterShortLabelPreviewData() =
  ControllersData.Filter(
    items = listOf(
      &quot;a&quot;,
      &quot;b&quot;,
      &quot;c&quot;,
      &quot;d&quot;,
      &quot;e&quot;,
      &quot;f&quot;,
      &quot;g&quot;,
      &quot;h&quot;,
      &quot;i&quot;,
      &quot;j&quot;,
      &quot;k&quot;,
    ).map { it.toLabel(tag = it) },
    selectedItemIndex = 1,
    onClick = {},
  )
