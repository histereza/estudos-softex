from time import sleep

seg = int(input("Indique um segundo inicial para a contagem: "))

print("Iniciando contagem regressiva... ")
for i in range(seg, 0, -1):
    print(i)
    sleep(1)
print("BUM!!!")
