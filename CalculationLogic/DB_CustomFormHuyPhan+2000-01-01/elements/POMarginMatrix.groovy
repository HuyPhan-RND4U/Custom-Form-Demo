List<Object> selectedPOMatrixRows = out.POMargin as List<Object>

def matrixUtils = libs.SharedLib.ResultMatrixUtils
return matrixUtils.resultMatrixFromList(
        selectedPOMatrixRows as List<Map>,
)
