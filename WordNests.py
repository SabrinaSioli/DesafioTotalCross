# Word Nests (Part 2)
# Link: https://edabit.com/challenge/ZwmfET5azpvBTWoQT
''' Basically I should test if there is the substring 'word' in the string 'nest', then
  I remove the substring until the string 'nest' it's empety or until there is no more substring in the 'word'
  If 'word' satys empty, then the word nest is  valid, else the word nest is not valid.
'''
#Tests
def valid_word_nest(word, nest):
  while nest.count(word) == 1: # I need to iterat while there is the substring 'word' in 'nest'
	  nest = nest.replace(word, '') # then I remove the substring 'word' in 'nest' using the method replace
  return nest==''


print(valid_word_nest("deep", "deep"))
print(valid_word_nest("novel", "nonnonovnovnovelelelvelovelvel"))
print(valid_word_nest("painter", "ppaintppapaipainterinternteraintererainter")  )
print(valid_word_nest("shape", "sssshapeshapehahapehpeape"))