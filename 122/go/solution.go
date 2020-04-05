package _go

func Do(prices []int) int {
	if len(prices) == 0 {
		return 0
	}

	profit := 0
	min := prices[0]
	for _, p := range prices[1:] {
		if p > min {
			profit += p - min
		}

		min = p
	}

	return profit
}
