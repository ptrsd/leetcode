package solution

func Do(prices []int) int {
	if len(prices) == 0 {
		return 0
	}

	profit := 0
	minPrice := prices[0]
	for _, p := range prices[1:] {
		if minPrice > p {
			minPrice = p
		} else {
			curr := p - minPrice
			if profit < curr {
				profit = curr
			}
		}
	}

	return profit
}
