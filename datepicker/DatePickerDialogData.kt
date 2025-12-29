package pl.gov.coi.common.ui.ds.datepicker

import java.time.LocalDate

data class DatePickerDialogData(
  val initialDate: LocalDate? = null,
  val onDateChange: (LocalDate) -&gt; Unit,
  val close: () -&gt; Unit,
  val datePickerDataVMS: DatePickerDataVMS,
)
