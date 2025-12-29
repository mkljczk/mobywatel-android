package pl.gov.coi.common.ui.ds.bottomnavigation.provider

import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.bottomnavigation.BottomNavigationData
import pl.gov.coi.common.ui.ds.bottomnavigation.BottomNavigationItem
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class BottomNavigationPreviewParameterProvider :
  CustomPreviewParameterProvider&lt;BottomNavigationData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;BottomNavigationData&gt;&gt; =
    sequenceOf(
      ScreenShotTestData(
        screenShotTestName = &quot;BottomNavigationFiveElements&quot;,
        value = BottomNavigationData(
          items = listOf(
            BottomNavigationItem(
              label = &quot;Start&quot;.toLabel(),
              unselectedIconResId = R.drawable.ab001_home,
              selectedIconResId = R.drawable.b001_home,
              onClickAction = {},
            ),
            BottomNavigationItem(
              label = &quot;Dokumenty&quot;.toLabel(),
              unselectedIconResId = R.drawable.ad005_framed_person,
              selectedIconResId = R.drawable.b002_framed_person,
              onClickAction = {},
            ),
            BottomNavigationItem(
              label = &quot;Usługi&quot;.toLabel(),
              unselectedIconResId = R.drawable.ac001_services,
              selectedIconResId = R.drawable.b004_services,
              onClickAction = {},
            ),
            BottomNavigationItem(
              label = &quot;Kod QR&quot;.toLabel(),
              unselectedIconResId = R.drawable.ai001_scanner_qr,
              selectedIconResId = R.drawable.b003_scanner_qr,
              onClickAction = {},
            ),
            BottomNavigationItem(
              label = &quot;Więcej&quot;.toLabel(),
              unselectedIconResId = R.drawable.ab010_more,
              selectedIconResId = R.drawable.b005_more,
              onClickAction = {},
            ),
          ),
          selectedItemIndex = 0,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot;BottomNavigationTwoElements&quot;,
        value = BottomNavigationData(
          items = listOf(
            BottomNavigationItem(
              label = &quot;Start&quot;.toLabel(),
              unselectedIconResId = R.drawable.ab001_home,
              selectedIconResId = R.drawable.b001_home,
              onClickAction = {},
            ),
            BottomNavigationItem(
              label = &quot;Więcej&quot;.toLabel(),
              unselectedIconResId = R.drawable.ab010_more,
              selectedIconResId = R.drawable.b005_more,
              onClickAction = {},
            ),
          ),
          selectedItemIndex = 0,
        ),
      ),
    )
}
