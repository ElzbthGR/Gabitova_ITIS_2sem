print('Введите число')
n = int(input())

file = open('file.html', 'w')

file.write('<!DOCTYPE html>\n <html>\n <head> \n<title>HTML Table Header</title>\n'
           '</head>\n <body>\n <table border="1">\n')
for i in range(1, n + 1):
    file.write('<tr>\n')
    file.write('<th>' + str(i) + '</th>\n')
    if i == 1:
        for j in range(2, n + 1):
          file.write('<th>' + str(i * j) + '</th>\n')
    else:
      for j in range(2, n + 1):
          file.write('<td>' + str(i * j) + '</td>\n')
    file.write('</tr>\n')
file.write('</table>\n</body>\n </html>\n')