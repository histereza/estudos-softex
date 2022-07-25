import pandas as pd

df = pd.read_csv('notas_alunos.csv')
media = (df["nota_1"] + df["nota_2"]) / 2
df["media"] = media

df.loc[(df["media"] >= 7) | (df["faltas"] <= 5), "situacao"] = "APROVADO"
df.loc[(df["media"] < 7) | (df["faltas"] > 5), "situacao"] = "REPROVADO"
print(df)

mais_faltas = df["faltas"].max()
media_geral = df["media"].median()
maior_media = df["media"].max()

df.to_csv('alunos_situacao.csv')

print(f"Maior número faltas: {mais_faltas}")
print(f"Média geral das notas: {media_geral}")
print(f"Maior média: {maior_media}")
