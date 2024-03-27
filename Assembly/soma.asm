.data

.text
	li $v0,5
	syscall
	move $t0, $v0
	
	add $s0,$t0,$t1
	
	li $v0,1
	move $a0,$s0
	
	syscall