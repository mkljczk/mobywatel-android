package pl.gov.coi.common.ui.ds.searchbar.provider

import pl.gov.coi.common.ui.ds.searchbar.SearchBarData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class SearchBarPPP : CustomPreviewParameterProvider&lt;SearchBarData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;SearchBarData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;SearchBarInactive&quot;,
      value = createInitializedState(
        isActive = false,
        query = &quot;&quot;,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SearchBarActive&quot;,
      value = createInitializedState(
        isActive = true,
        query = &quot;&quot;,
      ),
    ),
  )

  private fun createInitializedState(
    isActive: Boolean,
    query: String,
  ) = SearchBarData(
    placeholder = &quot;Wyszukaj&quot;.toLabel(),
    isActive = isActive,
    query = query,
    onQueryChange = { _ -&gt; },
    onActiveChange = { _ -&gt; },
    onClearClicked = {},
  )
}
