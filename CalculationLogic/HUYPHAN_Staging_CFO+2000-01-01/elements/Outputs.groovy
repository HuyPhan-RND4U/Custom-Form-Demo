if (!customFormProcessor.isPostPhase()) {
    return
}
Object pricingConfigurator = api.input("pricingConfigurator")
List<Object> selectedPOMatrixRows = pricingConfigurator.selectedRows.findAll {
    it.selected
}

def matrixUtils = libs.SharedLib.ResultMatrixUtils
def matrix = matrixUtils.resultMatrixFromList(
        selectedPOMatrixRows,
)

customFormProcessor.addOrUpdateOutput([
        resultName : "rows",
        resultLabel: "Selected Rows",
        result     : matrix,
        resultType : "MATRIX"
])