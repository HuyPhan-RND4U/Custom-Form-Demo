if (!customFormProcessor.isPostPhase()) {
    return
}

Object pricingConfigurator = api.input("pricingConfigurator")
List<Object> selectedPOMatrixRows = pricingConfigurator.poMatrix

def matrixUtils = libs.SharedLib.ResultMatrixUtils
def matrix = matrixUtils.resultMatrixFromList(
        selectedPOMatrixRows as List<Map>,
)

customFormProcessor.addOrUpdateOutput([
        resultName : "POMatrix",
        resultLabel: "PO Matrix",
        result     : matrix,
        resultType : "MATRIX"
])