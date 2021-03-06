package _go

import "testing"

type testCase struct {
	input    []int
	expected int
}

var testCases = []testCase{
	{[]int{7, 1, 5, 3, 6, 4}, 7},
	{[]int{1, 2, 3, 4, 5}, 4},
	{[]int{}, 0},
	{[]int{0}, 0},
	{[]int{7, 6, 4, 3, 1}, 0},
}

func Test_solution(t *testing.T) {
	for _, test := range testCases {
		actual := Do(test.input)
		if actual != test.expected {
			t.Errorf("expected: %v, actual: %v", test.expected, actual)
		}
	}
}
