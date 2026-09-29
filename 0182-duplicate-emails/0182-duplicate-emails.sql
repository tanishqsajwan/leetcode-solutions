select email as Email
from Person
GROUP BY email
HAVING count(Email) > 1;