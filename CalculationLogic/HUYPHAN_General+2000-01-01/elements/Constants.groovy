import groovy.transform.Field

@Field final String PRODUCT_LABEL = "productLabel"
@Field final String CURRENCY = "currency"
@Field final String CUSTOMER_ID = "customerId"
@Field final String CUSTOMER_NAME = "customerName"
@Field final String SEGMENTATION = "segmentation"
@Field final String LIST_PRICE = "listPrice"
@Field final String STANDARD_DISCOUNT = "standardDiscount"

@Field final String PRODUCT_LABEL_LABEL = "Product Label"
@Field final String CURRENCY_LABEL = "Currency"
@Field final String CUSTOMER_ID_LABEL = "Customer Id"
@Field final String CUSTOMER_NAME_LABEL = "Customer Name"
@Field final String SEGMENTATION_LABEL = "Segmentation"
@Field final String LIST_PRICE_LABEL = "List Price"
@Field final String STANDARD_DISCOUNT_LABEL = "Standard Discount %"

@Field def FIELD_NAME_TO_LABEL_MAP = [
        (PRODUCT_LABEL)    : PRODUCT_LABEL_LABEL,
        (CURRENCY)         : CURRENCY_LABEL,
        (CUSTOMER_ID)      : CUSTOMER_ID_LABEL,
        (CUSTOMER_NAME)    : CUSTOMER_NAME_LABEL,
        (SEGMENTATION)     : SEGMENTATION_LABEL,
        (LIST_PRICE)       : LIST_PRICE_LABEL,
        (STANDARD_DISCOUNT): STANDARD_DISCOUNT_LABEL
]

@Field def LABEL_TO_FIELD_NAME_MAP = [
        (PRODUCT_LABEL_LABEL)    : PRODUCT_LABEL,
        (CURRENCY_LABEL)         : CURRENCY,
        (CUSTOMER_ID_LABEL)      : CUSTOMER_ID,
        (CUSTOMER_NAME_LABEL)    : CUSTOMER_NAME,
        (SEGMENTATION_LABEL)     : SEGMENTATION,
        (LIST_PRICE_LABEL)       : LIST_PRICE,
        (STANDARD_DISCOUNT_LABEL): STANDARD_DISCOUNT
]