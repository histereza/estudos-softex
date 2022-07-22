import time

seg = int(input("Indique um segundo inicial para a contagem: "))

print("Iniciando contagem regressiva... ")
for i in range(seg, 0, -1):
    print(i)
    time.sleep(1)
print("BUM!!!")
