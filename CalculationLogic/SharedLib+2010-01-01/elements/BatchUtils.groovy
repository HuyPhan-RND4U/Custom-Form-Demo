/**
 * Prepares a set of SKUs of items being calculated in the current batch and internally caches this to api.global.currentBatch, api.local.isNewBatch and api.global.iterationNumber.
 * This function should be called prior {@link #isNewBatch()} or {@link #getCurrentBatchSku()} is called
 * so should be called in the very beginning of the logic ensuring api.retainGlobal = true needs is set in the first line of the first element.
 * @param sku
 * @return Returns a set of SKUs of a current batch
 */
void prepareBatch(String sku) {

    //every new pass is a new batch also
    def iterationNumber = api.getIterationNumber()
    api.local.isNewBatch = api.global.currentBatch == null || !api.global.currentBatch.contains(sku) || api.global.iterationNumber != iterationNumber

    if (api.local.isNewBatch) {
        api.global.iterationNumber = iterationNumber
        api.global.currentBatch = api.getBatchInfo()?.collect{ it.first() } ?: [ sku ] as Set
    }
}


/**
 * Returns true whether a new batch of SKUs is being calculated.
 * Elements can call this function to check whether a new batched database query for a new set of SKUs should be performed (rather than access api.local.isNewBatch directly).
 * This function can be called once the {@link #prepareBatch(String)} has been called.
 */
boolean isNewBatch() {
    return api.local.isNewBatch
}


/**
 * Returns a set of SKUs of a current batch.
 * Elements can call this function to get the list of SKUs to be used in a new batched database query (rather than access api.global.currentBatch directly).
 * This function can be called once the {@link #prepareBatch(String)} has been called.
 */
Set getCurrentBatchSku() {
    return api.global.currentBatch
}