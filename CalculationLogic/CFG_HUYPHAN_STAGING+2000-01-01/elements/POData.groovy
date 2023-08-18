import net.pricefx.formulaengine.DatamartContext

DatamartContext context = api.getDatamartContext()
Object constant = libs.HUYPHAN_General.Constants
def POTable = context.getDatamart("POsmall")
def query = context.newQuery(POTable)
        .select("ProductLabel", constant.PRODUCT_LABEL)
        .select("Currency", constant.CURRENCY)
        .select("CustomerID", constant.CUSTOMER_ID)
        .select("CustomerName", constant.CUSTOMER_NAME)
        .select("Segmentation", constant.SEGMENTATION)
        .select("ListPrice", constant.LIST_PRICE)
        .select("StdDiscount", constant.STANDARD_DISCOUNT)

def result = context.executeQuery(query)

return result?.getData()?.collect()
