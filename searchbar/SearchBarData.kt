package pl.gov.coi.common.ui.ds.searchbar

import pl.gov.coi.common.domain.label.Label

data class SearchBarData(
  val query: String,
  val onQueryChange: (String) -&gt; Unit,
  val isActive: Boolean,
  val onActiveChange: (Boolean) -&gt; Unit,
  val onClearClicked: () -&gt; Unit,
  val placeholder: Label,
)
