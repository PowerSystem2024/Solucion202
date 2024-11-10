names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]

alongP = [p for p in names if p[0] == 'P'] # esto regresa una nueva lista"
print(alongP) #Paolo Pepe

bottleC = [
    {"name": "Quilmes", "country": "Argentina"},
    {"name": "Corona", "country": "Mexico"},
    {"name": "Stella Artois", "country": "Belgius"}
]

Arg = [b for b in bottleC if b["country"] == "Argentina"]
print(Arg)