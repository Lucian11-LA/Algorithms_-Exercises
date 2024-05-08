.data
	num1: .byte 0
	num2: .byte 0
	
.text
	li $v0,5
	syscall
	move $t0,$v0
	
	li $v0,5
	syscall
	move $t1,$v0
	
	addi $s0,$zero,10
	addi $s1,$zero,8
	
	#sw $t0,num1
	#sw $t1,num2
	
	beq $t0,$t1,soma
		sub $s2,$s0,$s1
	j salto
	soma:
	
	  add $s2,$s0,$s1
	  
	salto:
	  li $v0,1
	  move $a0,$s2
	  syscall
	
	
	  
	
	