.data 
	primeiro_nome : .asciiz "Luciano"
	segundo_nome : .asciiz "Alfredo"
	space: .asciiz " "
.text

main:
	li $v0,4
	la $a0,primeiro_nome
	syscall 
	
	li $v0,4
	la $a0,space
	syscall
	
	li $v0,4
	la $a0, segundo_nome
	syscall
	
	li $v0,10
	syscall
				