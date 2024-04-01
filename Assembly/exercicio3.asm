.data
	rs: .ascii "O resultado é: "
.text
	addi $t1,$zero,8
	addi $t2,$zero,4
	
	mult $t3,$t1,$t2
	
	li $v0,4
	la $a0,rs
	syscall
	
	li $v0,1
	move $a0,$t3
	syscall
