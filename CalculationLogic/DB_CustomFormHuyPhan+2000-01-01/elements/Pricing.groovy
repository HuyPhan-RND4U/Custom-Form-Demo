String typedId = api.input("typedId")
return api.find(
        'CFO',
        0,
        1,
        null,
        [
                "outputsJson"
        ],
        Filter.equal('typedId', typedId)
).collect {
    return api.jsonDecode(it.outputsJson)?.POMatrix?.result?.entries ?: []
}.find()
