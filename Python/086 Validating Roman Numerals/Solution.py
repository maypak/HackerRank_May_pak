regex_pattern = r"M{,3}(CM|CD|D?C{,3})(XC|XL|L?X{,3})(IX|IV|V?I{,3})$"

import re
print(str(bool(re.match(regex_pattern, input()))))