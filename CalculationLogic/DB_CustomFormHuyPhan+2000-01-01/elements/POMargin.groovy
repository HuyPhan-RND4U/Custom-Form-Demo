String typedId = api.input("typedId")
return api.find(
        'CFO',
        0,
        1,
        null,
        [
                "outputsJson"
        ],
        Filter.equal("uniqueName", 'staging'),
        Filter.equal('parentTypedId', typedId)
).collect {
    return api.jsonDecode(it.outputsJson)?.rows?.result?.entries ?: []
}.find()
