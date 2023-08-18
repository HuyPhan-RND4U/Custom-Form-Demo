/**
 * Get median from list of numbers
 * @param items. List of number
 * @return the median value from the list
 * */
Number getMedian(List<Number> items) {
    if (!items) {
        return
    }
    items = items.sort()
    def size = items?.size
    def modulus = size % 2
    def median
    if (modulus == 0) {
        def firstIdx = (size / 2) as int
        def secondIdx = (firstIdx - 1) as int
        median = (items.get(firstIdx) + items.get(secondIdx)) / 2
    }
    else {
        median = items.get((((size - 1) / 2) as int))
    }

    return median
}