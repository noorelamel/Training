__author__ = 'tjb'

dna_sequences =  ['ttgaatgccttacaactgatcattacacaggcggcatgaagcaaaaatatactgtgaaccaatgcaggcg',
             'gauuauuccccacaaagggagugggauuaggagcugcaucauuuacaagagcagaauguuucaaaugcau',
             'gaaagcaagaaaaggcaggcgaggaagggaagaagggggggaaacc',
             'guuuccuacaguauuugaugagaaugagaguuuacuccuggaagauaauauuagaauguuuacaacugcaccugaucagguggauaaggaagaugaagacu',
             'gauaaggaagaugaagacuuucaggaaucuaauaaaaugcacuccaugaauggauucauguaugggaaucagccggguc']

def dna_or_rna (sequences):
    d_or_n = sequences.count ('t')
    if d_or_n > 0:
        return 'DNA'
    d_or_n = sequences.count ('u')
    if d_or_n > 0:
        return 'RNA'
    return 'UNKNOWN'

for strand in dna_sequences:
    answer = dna_or_rna(strand)
    if answer == 'DNA':
        print ('DNA')
    elif answer == 'RNA':
        print ('RNA')
    else:
        print ('UNKNOWN')

#Problem 4
print('Problem 4')
shrubdata = numpy.import('shrub_volume_experiment.csv', skiprows=1)
results_table = [] #exports to .csv

def calculate_height(height):
    if height > 5:
        return 'TALL'
    elif height < 2:
        return 'SHORT'
    else:
        return 'MEDIUM'

def calculate_carbon(plant):
    return 1.8 + 2 * math.log(plant [2] * plant [3] * plant [4])

for shrub in shrubdata:
    result = []
    result[0] = shrub[1]
    result[1] = calculate_height(shrub[4])
    result[2] = calculate_carbon(shrub)
    results_table.append(result)


