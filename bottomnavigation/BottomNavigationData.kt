package pl.gov.coi.common.ui.ds.bottomnavigation

data class BottomNavigationData(
  val items: List&lt;BottomNavigationItem&gt;,
  val selectedItemIndex: Int = 0,
)
