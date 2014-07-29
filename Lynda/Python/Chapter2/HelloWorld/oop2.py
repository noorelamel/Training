__author__ = 'deb'

class AnimalActions:
    def quack(self): return self.strings['quack']
    def feathers(self): return self.strings['feathers']
    def bark(self): return self.strings['bark']
    def fur(self): return self.strings['fur']

class Duck(AnimalActions):
    strings = dict(
        quack = "Quaaaack",
        feathers = 'The duck has gray and white feathers',
        bark = 'The duck cannot bark',
        fur = 'The duck has no fur'
    )

class Person(AnimalActions):
    strings = dict(
        quack = "The person imitates a duck",
        feathers = "The person takes a feather from the ground and shows it.",
        bark = "the person says woof",
        fur = 'the person puts on a fur coat.'
        )

class Dog(AnimalActions):
    strings = dict(
        quack = 'the dog cannot quack',
        feathers = 'the dog has no feathers',
        bark = 'Arrrf',
        fur = 'the dog has white fur with black spots'
    )

def in_the_doghouse(dog):
    print(dog.bark())
    print(dog.fur())

def in_the_forest(duck):
    print(duck.quack())
    print(duck.feathers())

def main():
    donald = Duck()
    john = Person()
    fido = Dog()

    print(" - In the forest:")
    for o in (donald, john, fido):
        in_the_forest(o)

    print("- In the doghouse:")
    for o in (donald, john, fido):
        in_the_doghouse(o)


if __name__ == "__main__": main()
