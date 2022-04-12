# #StringBuilder
StringBuilder objects are like String objects, except that they can be modified. Internally, these objects are treated like variable-length arrays that contain a sequence of characters. At any point, the length and content of the sequence can be changed through method invocations.

## Nameing Conventions: Java uses CamelCase as a practice for writing names of methods, variables, classes, packages, and constants. 

Camel’s case in java programming consists of compound words or phrases such that each word or abbreviation begins with a capital letter or first word with a lowercase letter, rest all with capital. Here in simpler terms, it means if there are two 



<br></br>
## Constructors in StringBuilder
| Constructor | Description |
|---|-----|
| StringBuilder(CharSequence seq) | Constructs a string builder that contains the same characters as the specified CharSequence. |
| StringBuilder(int length) | Create empty StringBuilder with specified length |
| StringBuilder() | It creates an empty String Builder with the initial capacity of 16. |
| StringBuilder(String str) | Constructs a string builder initialized to the contents of the specified string. |

---
<br></br>
## Methods in StringBuilder and Naming Conventions
| Method Name | Description and Naming Convention |
|---|---|
| append(String s) | Used to append with Existing String with this String. Overloaded with other types. Follows camelCase Naming Convention.
| insert(int offset, String s) | insert is used to insert String at the particular position of the existing String. So, the offset is required for inserting the String. |
| reverse() | returns the StringBuilder after reversing it. |
| ensureCapacity(int minimumCapacity) | It ensures that the capacity is atleast to the specified minimumCapacity. |
| substring(int beginIndex, int endIndex) | returns the substring from the beginIndex to the endIndex. substring is a single word the Naming convention is maintained. |
| replace(int startIndex, int endIndex, String str) | As the name suggests it is used to replace the String from a particular Start index to End index with this String which are given as parameters. |
| delete(int startIndex, int endIndex) | As the method name says it deletes the String from a specified start index to end index. |
| charAt(int index) | returns the Character at particular index. As the method name has two words, second word's Starting letter is Capitalized so as to follow the camelCase. |

