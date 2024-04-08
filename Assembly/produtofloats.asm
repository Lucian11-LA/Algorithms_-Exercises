.data
	resp: .asciiz "O produto é:  "
	n1: .float 3.14
	n2: .float 2.78
	res: .float 0.0
.text
	
	lwc1 $f0,n1
	lwc1 $f1,n2
	
	mul.s $f2,$f0,$f1
	
	swc1 $f2,res
	
	li $v0,4 
	la $a0,resp
	syscall
	
	
	li $v0,2
	mov.s $f12,$f2
	syscall
	
	
