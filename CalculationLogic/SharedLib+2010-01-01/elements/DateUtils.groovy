/**
 * Returns the lesser of two provided dates
 * @param date1
 * @param date2
 * @return
 */
Date mindate(Date date1, Date date2){
  return date1 < date2 ? date1 : date2
}

/**
 * Returns the greater of two provided dates
 * @param date1
 * @param date2
 * @return
 */
Date maxdate(Date date1, Date date2){
  return date1 > date2 ? date1 : date2
}

/**
 * Returns the number of days of overlap (intersect) within two provided date periods
 * @param start1 Start date of first period
 * @param end1 End date of first period
 * @param start2 Start date of second period
 * @param end2 End date of second period
 * @return Integer number of days where the two periods intersect
 */
int intersectingDays(Date start1, Date end1, Date start2, Date end2){
  return Math.max(mindate(end1,end2)-maxdate(start1,start2)+1,0)
}

/**
 * Returns the current year as integer
 * @return
 */
int currentYear(){
  return Calendar.getInstance().get(Calendar.YEAR);
}

/**
 * Returns the number of days within specified month of the year
 * @param month Number of month in year - ie, Jan = 1, Dec = 12.
 * @param year The year of occurrence, because its not always the same every year. If not provided or given null, defaults to current year
 * @return Integer number of days in specified month
 */
int daysInMonth(int month, Integer year = null){
  if(!year) year = currentYear()

  def cal = Calendar.getInstance()
  cal.set(year, (month-1), 1)
  return cal.getActualMaximum(Calendar.DAY_OF_MONTH)
}