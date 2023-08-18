List<Object> selectedPOMatrixRows = out.Pricing as List<Object>

def matrixUtils = libs.SharedLib.ResultMatrixUtils
return matrixUtils.resultMatrixFromList(
        selectedPOMatrixRows as List<Map>,
)
